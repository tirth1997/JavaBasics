package InterviewQuestion;

public class SecondLargestFromArrayOfRandomNumber {
    // Online Java Compiler
// Use this editor to write, compile and run your Java code online
// rand-number integer array using and find 2nd largest number
  //  Student(id,student,department) // Student count by department where Depart count >100



//    Select s.department , Count(s.student) from student s group by s.department having count(s.student) > 100;

 //   Transaction_Log(transaction_id ,customer_name,amount,date_time) //lasteest transaction from each customer


 //   Select transaction_id,customer_name,date_time from Transaction_Log group by customer_name order by date_time desc;

    public int secondLargest(int[] val){

            int largestNum=-1,smallestNum=-1;
            // int secondLargest=-1;

            //find the largest number
            for(int num:val){
                if(num > largestNum){
                    largestNum=num;
                }
            }
            //finding correct lardest number

            // subtract largest number and find lowest subraction
            int previousSum = -1;
            for(int num:val){
                // if(num > secondLargest && num != largestNum){
                //     secondLargest=num;
                // }
                previousSum = largestNum-num;
                if( largestNum-num > 0 && num != largestNum){
                    if(previousSum < (largestNum-smallestNum))
                        smallestNum=num;
                }
            }
            //return secondLargest;
            return smallestNum;
        }


        public static void main(String[] args) {
            int[] inputVal= {1,2,3,4,5,6};
            SecondLargestFromArrayOfRandomNumber hello=new SecondLargestFromArrayOfRandomNumber();
            int result=hello.secondLargest(inputVal);
            System.out.println(result);
        }
}
