from pyspark import SparkConf, SparkContext

con = SparkConf()
sc = SparkContext(conf = con)

list = [1, 2, 3, 4, 5, 6, 7]
rdd = sc.parallelize(list)
data = rdd.collect()
for d in data:
	print(d)
