class Vehicle {
  public int mYear;
  public String mBrand;
  public String mModel;
  public int mMiles;
  public int mPrice;

  public boolean worthBuying(int maxPrice){
    return (maxPrice > mPrice);
// Here, we define a method called worthBuying() within our Vehicle class. We know this method can only be called on Vehicle objects, because it has been defined specifically in this class.
// The access modifier public means this method is available to anyone (again, we'll explore access modifiers in depth later on).
// We also declare that this method will return a boolean type. We use the primitive boolean instead of its corresponding wrapper class Boolean, because we simply do not yet need to call any methods on this return value.
// We state that our worthBuying() method takes a single argument named maxPrice. We declare this argument to be the int primitive type. maxPrice will represent the most money a customer at our car dealership is willing to spend.
// Within our method, we simply return the result of (mPrice > maxPrice). mPrice refers to the mPrice attribute of any Vehicle we call this method on. This price is compared to the user-provided maxPrice. Our method will then return true or false depending on whether the user's maxPrice is greater or less than the cost of the vehicle.


  }
}
