public interface ApplyingInterface      // Used by a student to apply to various companies
{
    boolean canApply(Company<? extends Student> c);     // Returns true if the Student can and wants to apply to the Company
    void apply(Company<? extends Student> c);       // The Student applies to the Company
}
