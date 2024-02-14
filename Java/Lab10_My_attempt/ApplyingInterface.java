public interface ApplyingInterface      // Used to apply to companies
{
    boolean canApply(Company<? extends Student> c);
    // Returns true if the Student can and wants to apply to the Company
    // Any branch student can apply for ITCompany
    // But only PhoenixStudent can apply for CoreCompany
    
    void apply(Company<? extends Student> c);       // The Student applies to the Company
}
