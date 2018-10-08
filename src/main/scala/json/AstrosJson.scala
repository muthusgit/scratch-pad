package json

import com.fasterxml.jackson.core.{JsonFactory, JsonToken}
import org.codehaus.jackson._

/**
  * Created by muthu on 26/04/2017.
  */
object AstrosJson extends App {
  val jsonString = "{\"number\": 5, \"people\": [{\"craft\": \"ISS\", \"name\": \"Oleg Novitskiy\"}, " +
    "{\"craft\": \"ISS\", \"name\": \"Thomas Pesquet\"}, {\"craft\": \"ISS\", \"name\": \"Peggy Whitson\"}, " +
    "{\"craft\": \"ISS\", \"name\": \"Fyodor Yurchikhin\"}, {\"craft\": \"ISS\", \"name\": \"Jack Fischer\"}], \"message\": \"success\"}"


  val jsonParser = new JsonFactory().createJsonParser(jsonString)
  while( jsonParser.nextToken() != null ) {
    val name = scala.Option.apply(jsonParser.getCurrentName)
    if(name.nonEmpty && jsonParser.getCurrentName.equals("craft") && jsonParser.getCurrentToken.equals(JsonToken.VALUE_STRING))  print(jsonParser.getText +" | " )
    if(name.nonEmpty && jsonParser.getCurrentName.equals("name") && jsonParser.getCurrentToken.equals(JsonToken.VALUE_STRING))  println(jsonParser.getText )
  }
}
