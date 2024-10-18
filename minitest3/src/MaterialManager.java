import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;

// lớp quản lý vật liệu
public class MaterialManager {
    private Material[] materials;
    private int count; // Biến đếm số lượng vật liệu hiện có

    public MaterialManager(int size) {
        materials = new Material[size];
        count = 0;
    }

    // Thêm vật liệu
    public void addMaterial(Material material) {
        if (count < materials.length) {
            materials[count] = material;
            count++;
        } else {
            System.out.println("Danh sách vật liệu đã đầy, không thể thêm mới.");
        }
    }

    // Sửa vật liệu
    public void updateMaterial(String id, Material newMaterial) {
        for (int i = 0; i < count; i++) {
            if (materials[i].getId().equals(id)) {
                materials[i] = newMaterial;
                break;
            }
        }
    }

    // Xóa vật liệu
    public void removeMaterial(String id) {
        for (int i = 0; i < count; i++) {
            if (materials[i].getId().equals(id)) {
                // Dịch các phần tử còn lại sang trái sau khi xóa
                for (int j = i; j < count - 1; j++) {
                    materials[j] = materials[j + 1];
                }
                materials[count - 1] = null; // Gán phần tử cuối cùng là null
                count--;
                break;
            }
        }
    }

    // Tính tổng tiền của tất cả các vật liệu
    public double getTotalCost() {
        double total = 0;
        for (int i = 0; i < count; i++) {
            total += materials[i].getAmount(); // Gọi phương thức getAmount() đã được định nghĩa
        }
        return total;
    }

    // Sắp xếp vật liệu theo giá
    public void sortMaterialsByCost() {
        Arrays.sort(materials, 0, count, Comparator.comparingInt(Material::getCost));
    }

    // Tính số chênh lệch giữa chiết khấu và không chiết khấu tại ngày hôm nay
    public double getDiscountDifference() {
        double totalWithoutDiscount = 0;
        double totalWithDiscount = 0;

        for (int i = 0; i < count; i++) {
            totalWithoutDiscount += materials[i].getAmount();
            if (materials[i] instanceof CrispyFlour) {
                totalWithDiscount += materials[i].getAmount() * 0.94; // Giảm 6%
            } else if (materials[i] instanceof Meat) {
                totalWithDiscount += materials[i].getAmount() * 0.97; // Giảm 3%
            }
        }

        return totalWithoutDiscount - totalWithDiscount;
    }

    // Hiển thị danh sách vật liệu
    public void displayMaterials() {
        for (int i = 0; i < count; i++) {
            System.out.println(materials[i].toString() + " - Cost: " + materials[i].getCost());
        }
    }
}
