import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // mảng chứa 10 đối tượng quản lý vật liệu
        MaterialManager materialManager = new MaterialManager(10);

        // 5 đối tượng bột
        CrispyFlour flour1 = new CrispyFlour("f1", "Bột mì",LocalDate.of(2003,10,15),100);
        CrispyFlour flour2 = new CrispyFlour("f2", "Bột gạo",LocalDate.of(2003,10,15),120);
        CrispyFlour flour3 = new CrispyFlour("f3", "Bột ngô",LocalDate.of(2003,10,15),140);
        CrispyFlour flour4 = new CrispyFlour("f4", "Bột đậu",LocalDate.of(2003,10,15),160);
        CrispyFlour flour5 = new CrispyFlour("f5", "Bột bánh",LocalDate.of(2003,10,15),180);

        // 5 đối tượng thịt
        Meat meat1 = new Meat("m1", "Thịt bò", LocalDate.of(2003,10,15),200);
        Meat meat2 = new Meat("m2", "Thịt chó", LocalDate.of(2003,10,15),220);
        Meat meat3 = new Meat("m3", "Thịt gà", LocalDate.of(2003,10,15),240);
        Meat meat4 = new Meat("m4", "Thịt vịt", LocalDate.of(2003,10,15),260);
        Meat meat5 = new Meat("m5", "Thịt mèo", LocalDate.of(2003,10,15),280);

        // thêm đối tượng vào lớp quản lý vật liệu
        materialManager.addMaterial(flour1);
        materialManager.addMaterial(flour2);
        materialManager.addMaterial(flour3);
        materialManager.addMaterial(flour4);
        materialManager.addMaterial(flour5);
        materialManager.addMaterial(meat1);
        materialManager.addMaterial(meat2);
        materialManager.addMaterial(meat3);
        materialManager.addMaterial(meat4);
        materialManager.addMaterial(meat5);

        // thiết lập số lượng bột
        flour1.setQuantity(10);
        flour2.setQuantity(15);
        flour3.setQuantity(12);
        flour4.setQuantity(8);
        flour5.setQuantity(5);

        // thiết lập số lượng thịt
        meat1.setWeight(6);
        meat2.setWeight(7);
        meat3.setWeight(8);
        meat4.setWeight(10);
        meat5.setWeight(9);


        //hiện thỉ danh sách vật liệu
        System.out.println("Danh sách vật liệu :");
        materialManager.displayMaterials();

        // tính tổng tiền
        double totalCost = materialManager.getTotalCost();
        System.out.println("Tổng tiền của 10 vật liệu : " + totalCost);

        // sắp xếp theo giá
        materialManager.sortMaterialsByCost();
        System.out.println("\n Danh sách vật liệu sau khi sắp xếp theo giá :");
        materialManager.displayMaterials();

        //tính chênh lệch giữa chiết khấu và không chiết khấu
        double discountDifference = materialManager.getDiscountDifference();
        System.out.println("Chênh lệch chiết khấu và không chiết khấu : " + discountDifference);

        // Cập nhật vật liệu mới
        CrispyFlour updatedFlour = new CrispyFlour("f1", "Bột mì mới ", LocalDate.of(2003,11,15),110 );
        updatedFlour.setQuantity(15);
        materialManager.updateMaterial("f1", updatedFlour);

        System.out.println("\n Danh sách vật liệu sau khi cập nhật :");
        materialManager.displayMaterials();

        // xóa 1 vật liệu
        materialManager.removeMaterial("m3");
        System.out.println("\n Danh sách vật liệu sau khi xóa thịt gà :");
        materialManager.displayMaterials();
    }
}
