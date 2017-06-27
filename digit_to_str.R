num <- as.numeric(readline("Enter number:"))
n <- check(num)
switch(n,
       1 = print(one(num)),
       2 = print(two(num)),
       3 = print(three(num)),
       4 = print(four(num)),
       "unable to use program to convert num into words")

check <- function(num){
  if(num > 0 & num < 10){return (1)}
  else if(num >= 10 & num < 100){return (2)}
  else if(num >= 100 & num < 1000){return (3)}
  else if(num >= 1000 & num < 10000){return (4)}
  else {
    print("Invalid number entered")
    return (0)
  }
}
one <- function(num){
  dstr = ""
  switch(num,
         1 = {dstr <- "one"},
         2 = {dstr <- "two"},
         3 = {dstr <- "three"},
         4 = {dstr <- "four"},
         5 = {dstr <- "five"},
         6 = {dstr <- "six"},
         7 = {dstr <- "seven"},
         8 = {dstr <- "eight"}, 
         9 = {dstr <- "nine"},
         "invalid")
  return (dstr)
}
two <- function(num){
  dstr = ""
  if(num > 20){
    switch(num,
           10 = {dstr <- "ten"},
           11 = {dstr <- "eleven"},
           12 = {dstr <- "twelve"},
           13 = {dstr <- "thirteen"},
           14 = {dstr <- "fourteen"},
           15 = {dstr <- "fifteen"},
           16 = {dstr <- "sixteen"},
           17 = {dstr <- "seventeen"},
           18 = {dstr <- "eighteen"},
           19 = {dstr <- "nineteen"},
           "invalid")
  }
  else{
    nv <- as.numeric(strsplit(as.character(num), "")[[1]])
    switch(nv[c(1)],
           2 = {dstr <- "twenty"},
           3 = {dstr <- "thirty"}, 
           4 = {dstr <- "fourty"},
           5 = {dstr <- "fifty"},
           6 = {dstr <- "sixty"},
           7 = {dstr <- "seventy"},
           8 = {dstr <- "eighty"},
           9 = {dstr <- "ninety"},
           "invalid")
    if(nv[2] != 0){dstr <- dstr + " " + one(nv[2])}
  }
  return (dstr)
}
three<-function(num){
  nv <- as.numeric(strsplit(as.character(num), "")[[1]])
  dstr = ""
  if(nv[2] == 0 & nv[3]){dstr <- one(nv[1]) + " hundred"}
  else if(nv[2] == 0){dstr <- one(nv[1]) + " hundred and " + one(nv[3])}
  else {dstr <- one(nv[1]) + " hundred and " + two(merge(nv, 3))}
  
  return (dstr)
}
four<-function(num){
  nv <- as.numeric(strsplit(as.character(num), "")[[1]])
  dstr <- ""
  if(nv[2] == 0 & nv[3] == 0 & nv[4] == 0){dstr <- one(nv[1]) + " thousand"}
  else if(nv[2] == 0 & nv[3] == 0){dstr <- one(nv[1]) + " thousand and " + one(nv[4])}
  else if(nv[2] == 0){dstr <- one(nv[1]) + " thousand and " + two(merge(nv, 3))}
  else {dstr <- one(nv[1]) + " thousand " + three(merge(nv, 4))}
  
  return(dstr)
}
merge<-function(nv, len){
  nums<- as.character(nv)
  if(len == 3){num <- nums[2] + nums[3]}
  else if(len == 4){num <- nums[2] + nums[3] + nums[4]}
  return(as.numeric(num))
}