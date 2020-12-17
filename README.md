# Spring-mybatis-project-

마이바티스 라이브러리를 사용할때 초기에 설정을 어떻게 해야하는것이 좋은가?

		
							==> !필독! <==
					마이바티스 사용시 pom.xml 에 JDBC 라이브러리 , MYbatis 라이브러리
					XML에 임포트 해줘야함 
					servlet-context.xml에 
					1) JDBC 연결을 위한 초기 xml세팅
					2) mybatis 사용을 위한 초기 xml 세팅
					3)* class path ==> 현재 사용하고있는 package 경로를 써줘야함
					4)안써주면 parsing 이 안된다 (xml Parsing X)
					5)mapper Xml ==> 중요
					<mapper namespace="com.javalecture.practice.CDAO.CDAO"> </mapper> 선언해주어야함
					사용하던 사용안하던
					이거를 안써주면 [09. 8. 28   19:14:57:806 KST] 0000000a TreeBuilder   W   ODCF0002E: 예외: 너무 일찍 파일 끝에 도달했습니다..

 					org.xml.sax.SAXParseException: 너무 일찍 파일 끝에 도달했습니다.
       					 at org.apache.xerces.util.ErrorHandlerWrapper.createSAXParseException(Unknown Source)
       					 at org.apache.xerces.util.ErrorHandlerWrapper.fatalError(Unknown Source)
					이런 종류의 에러가 발생 ==> Xml Parsing 문제 
					xml 파싱이 안되는 케이스
					1) incoding error
					2) route error	
					3) xml Mapper path error


