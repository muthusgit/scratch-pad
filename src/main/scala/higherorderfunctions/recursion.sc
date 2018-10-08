//Higher Orfer Function - Passing function as paramater
//The below is also an example of Linear recursion
def sumInt(f: Int => Int, a: Int, b: Int ): Int = {
if(a>b) 0 else
  f(a) + sumInt(f, a+1, b)
}

def sum(a: Int, b:Int): Int = sumInt(accFunc,a,b)
def sumSquare(a: Int, b:Int): Int = sumInt(accFuncSquare,a,b)
def sumCube(a: Int, b:Int): Int = sumInt(accFuncCube,a,b)
def sumFactorial(a: Int, b:Int): Int = sumInt(accFuncFactorial,a,b)

def accFunc(x : Int) : Int = x
def accFuncSquare(x : Int) : Int = x*x
def accFuncCube(x : Int) : Int = x*x*x
def accFuncFactorial(x : Int) : Int = if(x==0)1 else x * accFuncFactorial(x-1)

sum(1, 3)
sumSquare(1, 3)
sumCube(1, 3)
sumFactorial(1, 3)

//Simplified with Anonymous Function and Syntactic sugar
def sumSimplified(a: Int, b:Int): Int = sumInt(x=>x,a,b)
def sumSquareSimplified(a: Int, b:Int): Int = sumInt(x=> x*x,a,b)

sumSimplified(1, 3)
sumSquareSimplified(1, 3)


//Simple Tail Recursion
def sumIntTailRecursion(a: Int, b: Int, sum: Int ): Int = {
  if(a>b) sum else
    sumIntTailRecursion(a+1, b, sum+a)
}
def sumTailRecursion(a: Int, b:Int): Int = sumIntTailRecursion(a,b,0)
sumTailRecursion(1,3)




//Tail Recursion by passing function
//Advantage- It will not throw Out of Memory error as variables/calculated results are not held in stack
def sumIntTailRecur(f: Int=>Int, a: Int, b: Int): Int = {
  def loop(a: Int, acc: Int): Int = (
    if(a>b) acc else loop(a+1, acc+f(a))
    )
  loop(a, 0)
}

def sumTailRecur(a: Int, b:Int): Int = sumIntTailRecur(x=>x,a,b)
def sumTailRecurSqu(a: Int, b:Int): Int = sumIntTailRecur(x=>x*x,a,b)

sumTailRecur(1,3)
sumTailRecurSqu(1,3)

