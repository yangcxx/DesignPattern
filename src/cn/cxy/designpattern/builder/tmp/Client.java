package cn.cxy.designpattern.builder.tmp;

/**
 * Function: 客户端：合并Director类
 * Reason: TODO ADD REASON(可选).</br>
 * Date: 2017/9/20 15:17 </br>
 *
 * @author: cx.yang
 * @since: Thinkingbar Web Project 1.0
 */
public class Client {
    public static void main(String[] args) {
        InsuranceContract.ConcreteBuilder builder = new InsuranceContract.ConcreteBuilder("9527", 123l, 456l);
        InsuranceContract contract = builder.setPersonName("小明").setOtherData("Test").build();
        contract.someOperation();
    }
}
