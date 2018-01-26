# mybatis-generater
1、配置数据的的路径和需要映射的数据库generator.properties<br>
2、对数据库中表的的name可以做过滤映射，配置table_prefix<br>
3、配置生成的目录位置,PACKAGE_NAME. 因为需要生成sercice和impl 需要在PACKAGE_NAME新建service目录，然后在service目录下新建impl目录<br>
public class Generator {

    // 根据命名规范，只修改此常量值即可
    private static String MODULE = "generater";
    private static String DATABASE = "exam";
    //对表的名称做前缀过滤
    private static String TABLE_PREFIX = "";
    private static String PACKAGE_NAME = "cn.result";
    private static String JDBC_DRIVER = PropertiesFileUtil.getInstance("generator").get("generator.jdbc.driver");
    private static String JDBC_URL = PropertiesFileUtil.getInstance("generator").get("generator.jdbc.url");
    private static String JDBC_USERNAME = PropertiesFileUtil.getInstance("generator").get("generator.jdbc.username");
    private static String JDBC_PASSWORD = PropertiesFileUtil.getInstance("generator").get("generator.jdbc.password");

