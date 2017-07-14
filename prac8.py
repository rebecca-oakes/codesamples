from pyspark import SparkConf, SparkContext

def makeRecord(rec):
	record = rec.split("|")
	return (record[0], record[2])

con = SparkConf()
sc = SparkContext(conf = con)
rdd = sc.textFile("file:///home/cloudera/marks.txt")
header = rdd.first()
rdd = rdd.filter(lambda x: x <> header)

rdd1 = rdd.map(makeRecord)

