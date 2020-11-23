package sms;

public class Response {
	String group_id;
	String error_list;
	String success_count;
	String error_count;
	
	public static void main(String[] args) {
		String data="{\"group_id\":\"R2G8COVz9BsPXz0C\",\"error_list\":{\"1\":\"1062\"},\"success_count\":0,\"error_count\":1}";
		
		Response res=new Response();
		//System.out.println(data.indexOf("{"));	
		//System.out.println(data.lastIndexOf("}"));
		data=data.substring(1,90);
		
		String dataArray[]=data.split(",");
		
		String gidArray[]=dataArray[0].split(":");
		String elistArray[]=dataArray[1].split(":");
		String scountArray[]=dataArray[2].split(":");
		String ecountArray[]=dataArray[3].split(":");
		
		gidArray[1]=gidArray[1].substring(1,17);
		elistArray[2]=elistArray[2].substring(1,5);
		
		res.group_id=gidArray[1];
		res.error_list=elistArray[2];
		res.success_count=scountArray[1];
		res.error_count=ecountArray[1];
		
		System.out.println("group_id : "+res.group_id);
		System.out.println("error_list : "+res.error_list);
		System.out.println("success_count : "+res.success_count);
		System.out.println("error_count : "+res.error_count);
	}
}