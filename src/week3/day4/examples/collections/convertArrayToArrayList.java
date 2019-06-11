package week3.day4.examples.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class convertArrayToArrayList {
	
	public static void main(String[] args){
	String[] asset = {"equity", "stocks", "gold", "foriegn exchange", "fixed income"};
	ArrayList<String> obj=convertArrayToArrayList(asset);
	System.out.println(" The obj " +obj);
	}

			

public static ArrayList<String> convertArrayToArrayList(String[] asset){
	//ArrayList<String> newAssetList = new ArrayList<String>();
	ArrayList<String> res=new ArrayList<String>(Arrays.asList(asset));
	//Arrays.asList(asset);
	//newAssetList.add
	//newAssetList.addAll(Arrays.asList(asset));
	//newAssetList.addAll(res);
	return res;
	
}


}
