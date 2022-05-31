/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab_2;

/**
 *
 * @author Potap
 */
class products {

    private int item_id;
    private String Name;
    private int Count;
    private int PurchasePrice;
    private int SalePrice;

    

    public int getitem_id() {
        return item_id;
    }

    public void setitem_id(int Itemid) {
        this.item_id = item_id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getCount() {
        return Count;
    }

    public void setCount(int Count) {
        this.Count = Count;
    }

    public int getPurchasePrice() {
        return PurchasePrice;
    }

    public void setPurchasePrice(int PurchasePrise) {
        this.PurchasePrice = PurchasePrise;
    }

    public int getSalePrice() {
        return SalePrice;
    }

    public void setSalePrice(int SalePrice) {
        this.SalePrice = SalePrice;
    }
    
    @Override
    public String toString() {
        return "Название товара: "+Name+" Количество: "+Count;
    }

   
    
}
