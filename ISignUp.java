import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
interface ISignUp {
// 打印输出结果
    public void print();
// 检查是否有 stuType对应的班级名额
// 如果没有剩余名额，请返回 false ，否则学生将报名进入该班级并返回 true
     public boolean addStudent (int stuType);
// 解析命令行输入的参数（格式），如文档描述
   public static  IParams parse() throws Exception{ // 调用静态方法

       IParams s = new IParams() {
            int big ;
            int medium;
            int small;
           ArrayList<Integer> arrayList = new ArrayList<>();
           SchoolSystem AA = new SchoolSystem();
           List<String> list = new ArrayList<>();
           @Override

            public int getBig() {
               System.out.println("请您输入n:");
               Scanner scanner = new Scanner(System.in);
               int n=scanner.nextInt();
               list.add("SchoolSystem");
               for(int i=1;i<=n;i++)
               {
                   list.add("addStudent");
               }



               for (int i = 0; i < list.size(); i++) {
                   String[] arr = AA.parse(list.get(i));
                   if (i == 0) {
                       big = Integer.parseInt(arr[0]);
                       medium = Integer.parseInt(arr[1]);
                       small = Integer.parseInt(arr[2]);
                   } else {
                       arrayList.add(Integer.parseInt(arr[0]));
                   }
               }
                return big;
            }

            @Override
            public int getMedium() {
                return medium;
            }

            @Override
            public int getSmall() {
                return small;
            }

            @Override
            public ArrayList<Integer> getPlanSignUp() {

                return arrayList;
            }
        };
        return s;
   };

}