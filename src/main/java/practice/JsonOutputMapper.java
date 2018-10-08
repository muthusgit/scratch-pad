/*
* Project : DRE011 
* Date    : 8 Nov 2016
* Author  : Muthu Subramanian
*/

package practice;

import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author SubramanianM
 *
 */
public class JsonOutputMapper {
	
	public static void main(String args[]){
		try {
			new JsonOutputMapper().printJson();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public void printJson() throws Exception, JsonMappingException, IOException{
		ObjectMapper mapper = new ObjectMapper();
		
		List<String> l = new ArrayList<String>();
		l.add("tag_supplier_approval_number_1");
		l.add("tag_supplier_approval_number_2");
		l.add("tag_supplier_approval_number_3");
		
		//Object to JSON in file
		//mapper.writeValue(new File("c:\\file.json"), l);

		//Object to JSON in String
		String jsonInString = mapper.writeValueAsString(l);		
		System.out.println(jsonInString);

	}
}
