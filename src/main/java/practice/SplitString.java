/*
* Project : DRE011 
* Date    : 11 Nov 2016
* Author  : Muthu Subramanian
*/

package practice;

/**
 * @author SubramanianM
 *
 */
public class SplitString {
	public static void main(String args[]){
		split();
	}

	public static void split(){
		//"HI|Patch".map(string -> string.split(" ", 2)).map(array  -> println(array[0], array[1]));
		
		String[] s = "HI|Patch".split("\\|");
		System.out.println(s[0] );
		System.out.println(s[1]  );
	}

}