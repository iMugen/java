package day12.hw.hw05;

/**
 * @author Gakki
 * @date 2018/10/23 - 8:51
 */
public class Son extends Father {
    @Override
    public void askMoney() {
        System.out.println("向家中的财政老大要钱交(上)学(网)费(吧)...");
    }

    @Override
    public void spendMoney() {
        System.out.println("去网吧付钱给网管开了一台机器...");
    }

    public void helpFather(Helper helper) {
        helper.help();
    }

    //完成帮助Father打酱油的方法
    public void daJiangYou(Helper helper) {
        helper.help();
    }

    public static void main(String[] args){
        new Son().daJiangYou(() -> System.out.println("帮爸爸打酱油"));
    }

}
