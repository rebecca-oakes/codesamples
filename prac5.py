from pyspark import SparkConf, SparkContext

def breakrecord(rec):
	record = rec.split("|")
	if record[2] == 'F':
		return True
	else:
		return False

def makerecord(rec):
	record = rec.split("|")
	return record[3]

con = SparkConf()
sc = SparkContext(conf = con)
rdd = sc.textFile("file:///home/cloudera/Downloads/Users.txt")
header = rdd.first()
rdd = rdd.filter(lambda x: x <> header)

rdd2 = rdd.map(breakrecord).countByValue()
print(rdd2)

rdd3 = rdd.map(makerecord)
data = rdd3.distinct().collect()
print(data)
