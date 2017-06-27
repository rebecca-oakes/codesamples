tab <- 0
range <- 0
tab <- as.numeric(readline("What table do you want to see:"))
range <- as.numeric(readline("What number do you want to see it up to:"))

for (i in seq(1, range)){
  result <- tab * i
  print(paste("The times table by", i, "results in", result, sep = " "))
}

