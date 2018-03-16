package cn.cxy.designpattern.builder;

/**
 * Function: TODO
 * Reason: TODO ADD REASON(可选).</br>
 * Date: 2017/9/20 11:57 </br>
 *
 * @author: cx.yang
 * @since: Thinkingbar Web Project 1.0
 */
public class SuperRoleBuilder extends Builder {

    Role role = new Role();

    @Override
    public void buildHead() {
        role.setHead("Super head");
    }

    @Override
    public void buildFace() {
        role.setFace("Super face");
    }

    @Override
    public void buildBody() {
        role.setBody("Super body");
    }

    @Override
    public void buildHp() {
        role.setHp(150d);
    }

    @Override
    public void buildSp() {
        role.setSp(150d);
    }

    @Override
    public void buildMp() {
        role.setMp(150d);
    }

    @Override
    public Role getRole() {
        return role;
    }

}
