/*
* Project : DRE011 
* Date    : 8 Nov 2016
* Author  : Muthu Subramanian
*/

package practice;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

//import scala.Option;

import com.amtsybex.nifais.catalogue.ApprovedTagType;
import com.amtsybex.nifais.catalogue.Location;
import com.amtsybex.nifais.catalogue.NIFAISUser;
import com.amtsybex.nifais.catalogue.NIFAISUserACL;
import com.amtsybex.nifais.dataaccess.dao.DAOFactory;
//import com.amtsybex.nifais.catalogue.RoleToNIFAISUser;
//import com.amtsybex.nifais.dataaccess.dao.GlobalSQLServerDataAccess;
import com.amtsybex.nifais.dataaccess.dao.sqlserver.SQLServerApprovedTagTypeDAO;
import com.amtsybex.nifais.dataaccess.dao.sqlserver.SQLServerLocationDAO;
import com.amtsybex.nifais.dataaccess.dao.sqlserver.SQLServerNIFAISUserDAO;
//import com.amtsybex.nifais.dataaccess.dao.sqlserver.SQLServerRoleToNIFAISUserDAO;
import com.amtsybex.nifais.dataaccess.dao.sqlserver.SQLServerTagAllocationDAO;

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
		
		System.out.println("***********************************************************************");
	
		//GlobalSQLServerDataAccess globalDataSource = new GlobalSQLServerDataAccess();
		/*SQLServerLocationDAO locationDAO = new SQLServerLocationDAO(globalDataSource.getDataSource());	
		Option<Location> location = locationDAO.locationByID(1);	
		
		jsonInString = mapper.writeValueAsString(location.getOrElse(null));
		System.out.println(jsonInString);		
		System.out.println(JsonUtil.toJson(location));*/
		
		System.out.println("***********************************************************************");
		
		DAOFactory dao = new DAOFactory("");
		//Option<NIFAISUserACL> userACLOption = dao.nifaisUserACL();	
		//SQLServerApprovedTagTypeDAO apoDAO = new SQLServerApprovedTagTypeDAO(globalDataSource.getDataSource(), userACLOption);
		
		/*Option<ApprovedTagType> app1 = apoDAO.approvedTagTypeById(1);
		ApprovedTagType a1 = app1.getOrElse(null);
		String s1 = mapper.writeValueAsString(a1);		
		System.out.println(JsonUtil.toJson(app1));
		
		System.out.println("***********************************************************************");

		
		Option<ApprovedTagType> app2 = apoDAO.approvedTagTypeById(2);
		ApprovedTagType a2 = app2.getOrElse(null);
		String s2 = mapper.writeValueAsString(a2);	
		System.out.println(JsonUtil.toJson(app2));*/
		
		System.out.println("***********************************************************************");

		
		/*List<String> aList = new ArrayList<String>();
		aList.add(s1);
		aList.add(s2);
		System.out.println(JsonUtil.toJson(aList));
		
		System.out.println("***********************************************************************");

		
		List<ApprovedTagType> aTagList = new ArrayList<ApprovedTagType>();	
		aTagList.add(a1);
		aTagList.add(a2);
		System.out.println(JsonUtil.toJson(aTagList));
		*/
		System.out.println("***********************************************************************");

		
		//SQLServerTagAllocationDAO taDAO = new SQLServerTagAllocationDAO(globalDataSource.getDataSource());
		//taDAO.tagAllocationByAllocationId(Id)
		
		//SQLServerNIFAISUserDAO uDAO = new SQLServerNIFAISUserDAO(globalDataSource.getDataSource());		
		//Option<NIFAISUser> u = uDAO.userByUserName("NU1");
		
		
		/*SQLServerRoleToNIFAISUserDAO rDAO = new SQLServerRoleToNIFAISUserDAO(globalDataSource.getDataSource());	
		List<RoleToNIFAISUser> uL = rDAO.roleByNIFAISUserUsername("JOE");
		System.out.println(JsonUtil.toJson(uL));*/
		
	}
}
