from pyspark import SparkConf, SparkContext

con = SparkConf()
sc = SparkContext(conf = con)
rdd1 = sc.textFile("file:///home/cloudera/trainees.txt")
rdd2 = sc.textFile("file:///home/cloudera/trainers.txt")
header = rdd1.first()
rdd1 = rdd1.filter(lambda x: x <> header)
rdd2 = rdd2.filter(lambda x: x <> header)

rddU = rdd1.union(rdd2)
rddI = rdd1.intersection(rdd2)
rddS = rdd1.subtract(rdd2)

dataU = rddU.collect()
print(dataU)
dataI = rddI.collect()
print(dataI)
dataS = rddS.collect()
print(dataS)
