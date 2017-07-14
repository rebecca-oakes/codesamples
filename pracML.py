from pyspark import SparkConf, SparkContext
con = SparkConf()
sc = SparkContext(conf = con)

genres = {5:"Unknown",6:"Action",7:"Adventure",8:"Animation",9:"Childrens",10:"Comedy",11:"Crime",12:"Documentary",13:"Drama",14:"Fantasy",15:"Noir",16:"Horror",17:"Musical",18:"Mystery",19:"Romance",20:"SciFi",21:"Thriller",22:"War",23:"Western"}
currentGenre = 5

def getRatings(record):
	print record[0][2]
	if record[0][1] ==	id[0][0] and record[0][2] == 5:
		return record

def getGenres(row):
	cols = row.split("|")
	global currentGenre
	return cols[currentGenre]

rddI = sc.textFile("file:///home/cloudera/Downloads/Movies.item")
rddM = sc.textFile("file:///home/cloudera/Downloads/Moving-Ratings-Done.data")
rrdU = sc.textFile("file:///home/cloudera/Downloads/Users.txt")

lines = rddI.collect()

filRDD = rddI.filter(lambda x: 'GoldenEye' in x).collect()
print(filRDD)

for i in range(currentGenre, 24):
	print(genres[i], " count: ",rddI.map(getGenres).filter(lambda x: x == str(1)).count())
	currentGenre = currentGenre + 1
