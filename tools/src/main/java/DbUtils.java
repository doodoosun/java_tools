//package me.ele.buff.util;
//
//import java.net.UnknownHostException;
//import java.util.Date;
//import java.util.Set;
//
//import com.mongodb.BasicDBObject;
//import com.mongodb.DB;
//import com.mongodb.DBCollection;
//import com.mongodb.DBCursor;
//import com.mongodb.DBObject;
//import com.mongodb.MongoClient;
//import com.mongodb.WriteConcern;
//import com.mongodb.WriteResult;
//
//public class DbUtils {
//	
//	public static void main(String[] args) throws UnknownHostException {
//		
//		String myUserName = "admin";
//		String myPassword = "admin";
//		MongoClient mongoClient = new MongoClient("localhost", 27017);
//
//		// 1.数据库列表
//		for (String s : mongoClient.getDatabaseNames()) {
//			System.out.println("DatabaseName=" + s);
//		}
//
//		// 2.链接student数据库
//		DB db = mongoClient.getDB("mytest");
//		mongoClient.setWriteConcern(WriteConcern.JOURNALED);
//
//		// 3.用户验证
////		boolean auth = db.authenticateCommand(username, password);
////		System.out.println("auth=" + auth);
//
//		// 4.集合列表
//		Set<String> colls = db.getCollectionNames();
//		for (String s : colls) {
//			System.out.println("CollectionName=" + s);
//		}
//
//		// 5.获取摸个集合对象
//		DBCollection coll = db.getCollection("user");
//		System.out.println(" coll "+coll.getFullName());
//		
//		
////		BasicDBObject doc = new BasicDBObject("_id", "6")
////		   .append(  "name", new BasicDBObject("username", "limingnihao").append("nickname", "黎明你好")  )
////		   .append("password", "123456")
////		   .append("password", "123456")
////		   .append("regionName", "北京")
////		   .append("works", "5")
////		   .append("birth", new Date());
////		WriteResult result = coll.insert(doc);
////
////		System.out.println("insert-result: " + result);
//		
//		System.out.println("----1----");
//		// 2.1查询 - one
//		DBObject myDoc = coll.findOne();
//		System.out.println(myDoc);
//
//		System.out.println("----2----");
//		// 2.2 查询 - 数量
//		System.out.println(coll.getCount());
//
//		System.out.println("----3---");
//		// 2.3查询 - 全部
//		DBCursor cursor = coll.find();
//		while (cursor.hasNext()) {
//		System.out.println("全部--------" + cursor.next());
//		}
//
//		System.out.println("----4----");
//		// 2.4查询 - 过滤 - 等于
//		BasicDBObject query = new BasicDBObject("age", 20);
//		cursor = coll.find(query);
//		while (cursor.hasNext()) {
//		System.out.println("age=20--------" + cursor.next());
//		}
//
//		System.out.println("----5----");
//		// 2.5查询 - 过滤条件 - 不等于
//		query = new BasicDBObject("age", new BasicDBObject("$ne", 1));
//		cursor = coll.find(query);
//		while (cursor.hasNext()) {
//		System.out.println("age!=1" + cursor.next());
//		}
//
//		System.out.println("----6----");
//		// 2.6查询 - 过滤条件 - 20 < i <= 30
//		query = new BasicDBObject("age", new BasicDBObject("$gt", 20).append("$lte", 30));
//		cursor = coll.find(query);
//		while (cursor.hasNext()) {
//		System.out.println("20<age<=30" + cursor.next());
//		}
//		
//	}
//
//}
