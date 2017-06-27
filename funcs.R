outer <- function(x){
  inner<- function(x){
    print(paste("Hello ", x))
  }
}

call <- function(f = add){
  do.call(f, list(7, 8))
}

add <- function(x = 0, y = 0){
  print(x + y)
}

x <- outer()
x("Rebecca")

c <- call()
c(add)