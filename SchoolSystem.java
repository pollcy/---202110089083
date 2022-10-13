import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SchoolSystem implements ISignUp {//继承接口
        int big;   //1
        int medium; // 2
        int small; // 3
    public SchoolSystem(){}///构造方法
    public SchoolSystem(int big, int medium, int small) { //初始化
        this.big = big;
        this.medium = medium;
        this.small = small;
    }
    static Scanner s = new  Scanner(System.in);
    static ArrayList<Object> list = new ArrayList<>();//静态list存储Object
    public static void main(String[] args) throws Exception {

        IParams params = ISignUp.parse();//SchoolSystem.parse();

            SchoolSystem sc = new SchoolSystem (params.getBig(), params.getMedium(),params.getSmall());
            list.add(null);

            ArrayList<Integer> plan = params. getPlanSignUp(); //   "SchoolSystem","addStudent", "addStudent", "addStudent", "addStudent"] list .size()
            System.out.println(plan);
            for (int i = 0; i < plan.size(); i++) {           //    [[1, 1, 0],           [1], [2], [3], [1]]    [ 1 1 0] string
                list.add(sc. addStudent (plan.get(i)));     //    [null, true, true, false, false]
            }
            sc.print();
        }

    @Override
    public void print() {
        System.out.println(list);
    }

    @Override
    public boolean addStudent(int stuType) {
        if(stuType == 1){
            if(big != 0){
                big--;
            }
            else{
                return false;
            }
        }
        else if(stuType == 2){
            if(medium != 0){
                medium--;
            }else{
                return false;
            }
        }
        if(stuType == 3){
            if(small != 0){
                small--;
            }else{
                return false;
            }
        }
        return true;
    }

    public String[]  parse(String input) {
        String[] a;
        if (input.equals("addStudent")) {
             a = new String[1];
            a[0] = s.next();
        } else {
             a = new String[3];
            for (int i = 0; i < 3; i++) {
                a[i] = s.next();
            }
        }
        return a;
    }
}
