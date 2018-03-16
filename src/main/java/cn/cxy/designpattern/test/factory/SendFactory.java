package cn.cxy.designpattern.test.factory;

/**
 * Function: TODO
 * Reason: TODO ADD REASON(可选).</br>
 * Date: 2017/9/26 14:47 </br>
 *
 * @author: cx.yang
 * @since: Thinkingbar Web Project 1.0
 */
public class SendFactory {

    public Sender produce(String type){
        if ("mail".equalsIgnoreCase(type)){
            return new MailSender();
        }else if ("sms".equalsIgnoreCase(type)){
            return new SmsSender();
        }else {
            System.out.println("wrong type input");
            return null;
        }
    }

}
