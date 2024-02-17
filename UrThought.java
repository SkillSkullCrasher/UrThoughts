import java.util.*;
import java.time.*;

class UrThoughs{

    String writer;
    String topic;
    String post;
    int views;
    LocalDate currentDate ;
    LocalTime currentTime;


    UrThoughs(String writer,String topic, String post, int views){
        this.writer=writer;
        this.topic=topic;
        this.post=post;
       this.views=views;
       this.currentDate = LocalDate.now();
       this.currentTime = LocalTime.now();

        // this.views=views;
    }

}

class UrThought{

   public static void display(ArrayList<UrThoughs> ListOfThoughts ){
   
    for(UrThoughs u: ListOfThoughts){
        // System.out.println("Writer: "+u.writer +" topic: "+ u.topic +" post: "+ u.post +" views: "+ u.views);
        System.out.println("Writer: "+ u.writer); 
        // String writer = sc.next();
        System.out.println("topic: " + u.topic);  
        // String topic = sc.next();
        System.out.println("post: " + u.post);
        System.out.println("views: " + u.views);
        System.out.println("On: " + u.currentDate); 
        System.out.println( "at: "+ u.currentTime);
    
        System.out.println();
        System.out.println();
      
 
   }}
    public static void main(String[] args){

          Scanner sc=new Scanner(System.in);
        ArrayList<UrThoughs> ListOfThoughts = new ArrayList<>();
        ListOfThoughts.add(new UrThoughs("John Doe", "Technology", "AI is the simulation of human intelligence in machines. It can be used in various applications such as voice recognition, natural language processing, image recognition, and decision making.", 1));
        ListOfThoughts.add(new UrThoughs("Jane Smith", "Science", "Quantum physics is the study of the behavior of matter and energy at the smallest scales. It has the potential to revolutionize technology and our understanding of the universe.", 2));
        ListOfThoughts.add(new UrThoughs("Bob Johnson", "Business", "Digital marketing is the use of the internet and other digital channels to promote or market products and services. It is a cost-effective and efficient way to reach a large audience.", 0));
        ListOfThoughts.add(new UrThoughs("Alice Davis", "Art", "Abstract expressionism is a style of art that emphasizes spontaneous, emotional expression. It emerged in the 1940s and 1950s and is characterized by large canvases, bold colors, and loose brushstrokes.", 3));
        ListOfThoughts.add(new UrThoughs("Charlie Brown", "Philosophy", "Existentialism is a philosophical movement that emphasizes individual freedom and choice. It asserts that individuals have the power to create their own meaning in life.", 1));
        ListOfThoughts.add(new UrThoughs("Lucy Van Pelt", "Psychology", "Cognitive behavioral therapy is a type of psychotherapy that focuses on changing negative thought patterns and behaviors. It has been shown to be effective in treating a wide range of mental health issues.", 0));
        ListOfThoughts.add(new UrThoughs("Linus Van Pelt", "Literature", "To Kill a Mockingbird is a novel by Harper Lee that explores themes of racism and moral growth. It has become a classic of modern American literature.", 4));
        ListOfThoughts.add(new UrThoughs("Snoopy", "Music", "The Beatles were an English rock band that formed in Liverpool in 1960. They are regarded as one of the most influential bands in history, with hits such as 'Hey Jude' and 'Let It Be'.", 2));
        ListOfThoughts.add(new UrThoughs("Woodstock", "History", "The Woodstock Music and Art Fair was a festival held in Bethel, New York, in 1969. It attracted over 400,000 people and is often regarded as a defining moment in the counterculture movement of the 1960s.", 1));
        ListOfThoughts.add(new UrThoughs("Sally Brown", "Education", "The Montessori method is an educational approach that emphasizes hands-on learning and individualized instruction. It was developed by Italian physician and educator Maria Montessori in the early 20th century.", 0));
        ListOfThoughts.add(new UrThoughs("Sallyi Brown", "Education", "The Montessori method is an educational approach that emphasizes hands-on learning and individualized instruction. It was developed by Italian physician and educator Maria Montessori in the early 20th century.", 0));
   
            char ask = 'o';
            // System.out.println("1.Do you want to add post ");
           System.out.println("-----------------------UrThoughts--------------------");
        //    System.out.println("-----------------------Thank You----------------------");
            System.out.println("1. Add post ");
        
            System.out.println("2. Trendy post ");
            System.out.println("3. Search");
            System.out.println("4. Exit");
System.out.println();
        System.out.print("Please select: ");
        int n=sc.nextInt();
        while( n<4 ||n>0){
       
       
        if(n==1){
            System.out.println("Please enter post details "); 
            System.out.print("Writer: "); 
            String writer = sc.nextLine();
            writer+=sc.nextLine();
            System.out.print("topic: ");  
            String topic = sc.next();
            topic+=sc.nextLine();
            System.out.println("post: ");
            String post = sc.nextLine(); // read an entire line of input for post
          //  post += sc.nextLine(); 
            // int views = sc.nextInt();
            ListOfThoughts.add(new UrThoughs(writer, topic, post,0));
            System.out.println();
            System.out.print("Do you wanna continue : y/Y");
                ask = sc.next().charAt(0);
                if(ask=='y' || ask== 'Y'){
                    System.out.println("1. Add post ");
        
                    System.out.println("2. Trendy post ");
                    System.out.println("3. Search");
                    System.out.println("4. Exit");
                    n=sc.nextInt();
                }else{   System.out.println();
                    System.out.println("-----------------------Thank You----------------------");
                    System.out.println();break;}
              
                    
        //   }
        }
      else  if(n==2){
                  Collections.sort(ListOfThoughts,(a,b)->b.views-a.views);
                  display(ListOfThoughts);
                  System.out.print("Do you wanna continue : y/Y");
                ask = sc.next().charAt(0);
                if(ask=='y' || ask== 'Y'){
                    System.out.println("1. Add post ");
        
                    System.out.println("2. Trendy post ");
                    System.out.println("3. Search");
                    System.out.println("4. Exit");
                    n=sc.nextInt();
                }else{  System.out.println();
                    System.out.println("-----------------------Thank You----------------------");
                    System.out.println();break;}
        }
      else  if(n==3){
            
            // System.out.print("Writer: "); 
            
            System.out.print("Search Writer: "); 
            String writer = sc.nextLine(); // read an entire line of input for post
            writer += sc.nextLine(); 
            boolean flag =false;

           for(UrThoughs u: ListOfThoughts){
            if(u.writer.toLowerCase().contains(writer.toLowerCase())){
                flag=true;
                u.views++;
                System.out.println("Writer: "+ u.writer); 
                // String writer = sc.next();
                System.out.println("topic: " + u.topic);  
                // String topic = sc.next();
                System.out.println("post: " + u.post);
                System.out.println("views: " + u.views);
                System.out.println("On: " + u.currentDate); 
                System.out.println( " at: "+ u.currentTime);
            //    ; ( " at: "+ u.currentTime);
        
                System.out.println();
                System.out.println();
                
            }
           }
           if(flag==false){
            System.out.println("sorry no such data found");
           }

           System.out.print("Do you wanna continue : y/Y");
           ask = sc.next().charAt(0);
           if(ask=='y' || ask== 'Y'){
            System.out.println("1. Add post ");
        
            System.out.println("2. Trendy post ");
            System.out.println("3. Search");
            System.out.println("4. Exit");
               n=sc.nextInt();
           }else {   
             System.out.println();
            System.out.println("-----------------------Thank You----------------------");
            System.out.println();break;}



            // System.out.print("topic: ");  
            // String topic = sc.next();
    //  yjjYeHOB       // System.out.println("post: ");
            // String post = sc.next();
        }


        else {  System.out.println();
             System.out.println("-----------------------Thank You----------------------");
             System.out.println();
        break;}
        
      }
       
                         
        //   if(ask == 'y' || ask =='Y'){
           
          

          
      
            
            
        
        

  }







}