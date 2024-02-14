public interface HiringInterface 
{
    boolean takeInterview();  // The Company interviews the Student that they would like to interview first, and returns true/false depending on whether or not they are impressed by the Student. If they are not impressed, they reject the student and his application is cancelled.
    
    void hire();            // The Company hires the Student that they just interviewed.
}
