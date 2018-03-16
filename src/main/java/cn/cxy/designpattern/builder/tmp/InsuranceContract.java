package cn.cxy.designpattern.builder.tmp;

import lombok.Getter;
import lombok.Setter;

/**
 * Function: 通过内部类的形式直接提供具体的建造者
 * Reason: TODO ADD REASON(可选).</br>
 * Date: 2017/9/20 15:08 </br>
 *
 * @author: cx.yang
 * @since: Thinkingbar Web Project 1.0
 */

@Setter
@Getter
public class InsuranceContract {

    private String contractId;
    private String personName;
    private String companyName;
    private long beginDate;
    private long endDate;
    private String otherData;

    /**
     * 私有化构造方法
     * @param builder
     */
    private InsuranceContract(ConcreteBuilder builder) {
        this.contractId = builder.contractId;
        this.personName = builder.personName;
        this.companyName = builder.companyName;
        this.beginDate = builder.beginDate;
        this.endDate = builder.endDate;
        this.otherData = builder.otherData;
    }

    public void someOperation() {
        System.out.println("当前正在操作的保险合同编号为【" + this.contractId + "】");
    }

    public static class ConcreteBuilder {
        private String contractId;
        private String personName;
        private String companyName;
        private long beginDate;
        private long endDate;
        private String otherData;

        public ConcreteBuilder(String contractId, long beginDate, long endDate) {
            this.contractId = contractId;
            this.beginDate = beginDate;
            this.endDate = endDate;
        }

        public ConcreteBuilder setPersonName(String personName) {
            this.personName = personName;
            return this;
        }

        public ConcreteBuilder setCompanyName(String companyName) {
            this.companyName = companyName;
            return this;
        }

        public ConcreteBuilder setOtherData(String otherData) {
            this.otherData = otherData;
            return this;
        }

        /**
         * 构建真正的对象并返回
         * @return
         */
        public InsuranceContract build() {
            if (null == this.contractId || this.contractId.trim().length() == 0) {
                throw new IllegalArgumentException("合同编号不能为空");
            }
            boolean signPerson = (this.personName != null && this.personName.trim().length() > 0);
            boolean signCompany = (this.companyName != null && this.companyName.trim().length() > 0);
            if (signPerson && signCompany) {
                throw new IllegalArgumentException("一份保险合同不能同时与个人和公司签订");
            }
            if (signPerson == false && signCompany == false) {
                throw new IllegalArgumentException("一份保险合同不能没有签订对象");
            }
            if (this.beginDate <= 0) {
                throw new IllegalArgumentException("一份保险合同必须有开始生效的日期");
            }
            if (this.endDate <= 0) {
                throw new IllegalArgumentException("一份保险合同必须有失效的日期");
            }
            if (this.endDate < this.beginDate) {
                throw new IllegalArgumentException("一份保险合同的失效日期必须大于生效日期");
            }
            return new InsuranceContract(this);
        }
    }

}
