package com.wanshare.oop.proxy;

/**
 * @ClassName ProxySearcher
 * @Description: 代理查询类，充当代理主题角色，它是查询代理，维持了对RealSearcher对象、AccessValidator对象和Logger对象的引用
 * @Auther: WenYang Wang
 * @Date: 2018-9-19 10:12
 */
public class ProxySearcher implements Searcher{

    private RealSearcher realSearcher = new RealSearcher();
    private AccessValidator validator;
    private Logger logger;

    @Override
    public String DoSearch(String userName, String keyword) {
        if (this.validate("admin")) {
            String result = realSearcher.DoSearch(userName, keyword);
            this.log(userName);
            return result;
        }
        return null;
    }

    public boolean validate(String userName){
        validator = new AccessValidator();
        return validator.validate(userName);
    }

    public void log(String userName){
        logger = new Logger();
        logger.log(userName);
    }
}
