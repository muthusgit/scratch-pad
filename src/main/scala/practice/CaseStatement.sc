object CaseStatement {

 var i = "Hello" match {
 	case "Hi" => println("Hi World")
 	case "Hey" => "Hello World"
 	case "Hello" => "Hello"
 }                                                //> i  : Any = Hello
 println(i)                                       //> Hello
 
	
}