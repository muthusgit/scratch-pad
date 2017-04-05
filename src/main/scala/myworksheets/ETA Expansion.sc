
//method
def methodA(s: String) = ???
def methodB(f: () => String) = ???

def f = "foo"
methodA(f)
//methodB(f) // error!
//methodA(f()) // error!
//methodB(f()) // error!


def f2() = "foo"
methodA(f2())
//methodB(f2()) // error!
methodA(f2)
methodB(f2)


