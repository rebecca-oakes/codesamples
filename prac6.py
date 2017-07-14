def bonus(x):
	return x + 50

from pyspark import SparkConf, SparkContext

con = SparkConf()
sc = SparkContext(conf = con)

rdd = sc.textFile("file:///home/cloudera/salary.txt")
header = rdd.first()
rdd = rdd.filter(lambda x: x <> header)

rdd2 = rdd.mapValues(bonus).collect()
print(rdd2)
