/**
 * @Project: gitHubProject
 * @Copyright: ©2021 版权所有 LL
 * @Author: admin
 * @Create: 2021-09-13 15:25
 * @Desc：
 **/

public class ifDemo {
    public static void main(String[] args){
        System.out.println("广州的价格是"+price("广州"));

    }

    public static int price(String city){
        if(city == "广州"){
            return 50;
        }else if(city == "长沙"){
            return 40;
        }else{
            return 30;
        }
    }
}
