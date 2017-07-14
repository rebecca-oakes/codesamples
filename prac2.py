from pyspark import SparkContext, SparkConf

def double(x):
	return x * 2

con = SparkConf()
sc = SparkContext(conf = con)

list = [1, 2, 3, 4, 5, 6, 7]
rdd1 = sc.parallelize(list)
data1 = rdd1.collect()
print(data1)

rdd2 = rdd1.map(double)
data2 = rdd2.collect()
print(data2)
