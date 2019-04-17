import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;


public class UrlLevelCount {
	public static void main(String[] args) {
		
		//List of Urls
		
		String[] listOfUrls = {"http://www.fancysite.com","http://www.fancysite.com/abc",
							"http://www.fancysite.com/abc/abc/com","http://www.fancysite.com/abc","https://www.google.co.in"};
		
		List list = (List) Arrays.asList(listOfUrls);
		
		//eliminating duplicate urls		
		Set set = new HashSet(list);
		Iterator itr  = set.iterator();
		while(itr.hasNext()){
		String input = (String)itr.next();
		
		//printing only same domain url levels		
		if(input.startsWith("http://www.fancysite.com")){
			int level=input.split("/").length-3;
			
			//printing levels of url
			System.out.println(input+"--level="+level);
		}
		}
	}
}
