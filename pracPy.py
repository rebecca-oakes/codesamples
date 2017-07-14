from pyspark import SparkConf, SparkContext

def makeRecord(rec):
	record = rec.split("|")
	return record

def totals(res1, res2, res3):
	results = [None] * 3
	results[0] = res1[0]
	results[1] = int(res1[2]) + int(res2[2]) + int(res3[2])
	results[2] = int(float(results[1])/450 * 100)	

	return results

def display(per, res):
	i = 0
	for p in per:
		results = res[i]
		i = i + 1
		print "RegNo: " + str(p[0])
		print "Name: " + str(p[1])
		print "Address: " + str(p[2])
		print "-------------------"
		print "Total Marks: " + str(results[1])
		print "Percentage: " + str(results[2]) + "%"
		per = float(results[2])
		if per >= 90:
			print "Grade: A+"
		elif per >= 80 and per < 90:
			print "Grade: A"
		elif per >= 70 and per < 80:
			print "Grade: B"
		elif per >= 60 and per < 70:
			print "Grade: C"
		else:
			print "Grade: Fail"

def MaxMarks(per, res):
	max = 0
	maxid = 0
	for r in res:
		if int(r[2]) > max:
			max = int(r[2])
			maxid = int(r[0])
	for p in per:
		if int(p[0]) == maxid:
			person = str(p[1])
	print "Name of person with highest percent is " + person	

con = SparkConf()
sc = SparkContext(conf = con)

rddP = sc.textFile("file:///home/cloudera/personal.csv")
rddR = sc.textFile("file:///home/cloudera/results.csv")
headerP = rddP.first()
headerR = rddR.first()
rddP = rddP.filter(lambda x: x <> headerP)
rddR = rddR.filter(lambda x: x <> headerR)
rddP = rddP.map(makeRecord)
rddR = rddR.map(makeRecord)

dataP = rddP.collect()
dataR = rddR.collect()

count = 0
i = 0
res = [None] * len(dataP)

while i < len(dataP)-1:
	res[i] = totals(dataR[count], dataR[count+1], dataR[count+2])
	i = i + 1
	count = count + 3

display(dataP, res)
maxMarks(dataP, res)
