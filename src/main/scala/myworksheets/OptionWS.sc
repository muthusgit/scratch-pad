val l = List(1, 2, 3)
val x = Option.apply(l)
val y = Option.apply(l).get

val z = Option.apply(null)
val a = Option.apply(z).get


