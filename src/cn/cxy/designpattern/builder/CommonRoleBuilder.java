package cn.cxy.designpattern.builder;

/**
 * Function: TODO
 * Reason: TODO ADD REASON(可选).</br>
 * Date: 2017/9/20 11:56 </br>
 *
 * @author: cx.yang
 * @since: Thinkingbar Web Project 1.0
 */
public class CommonRoleBuilder extends Builder {

    Role role = new Role();

    @Override
    public void buildHead() {
        role.setHead("Common head");
    }

    @Override
    public void buildFace() {
        role.setFace("Common face");
    }

    @Override
    public void buildBody() {
        role.setBody("Common body");
    }

    @Override
    public void buildHp() {
        role.setHp(100d);
    }

    @Override
    public void buildSp() {
        role.setSp(100d);
    }

    @Override
    public void buildMp() {
        role.setMp(100d);
    }

    @Override
    public Role getRole() {
        return role;
    }
}
