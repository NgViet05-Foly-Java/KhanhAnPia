import com.example.KTNC_Buoi5.Model.SanPham;
import com.example.KTNC_Buoi5.Service.SanPhamService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class SanPhamServiceTest {
    private SanPhamService sanPhamService;
    @BeforeEach
    void setUp() {
        sanPhamService = new SanPhamService();
        sanPhamService.themSP(new SanPham("SP001", "Laptop", 2, 15000000, 5, "Điện tử"));
        sanPhamService.themSP(new SanPham("SP002", "Điện thoại", 1, 8000000, 10, "Điện tử"));
        sanPhamService.themSP(new SanPham("SP003", "Tai nghe", 1, 500000, 20, "Phụ kiện"));
    }

    @Test
    void testXoaSanPham_MaHopLe() {
        assertTrue(sanPhamService.xoaSP("SP002"), "Xóa sản phẩm có mã hợp lệ phải trả về true");
        assertEquals(2, sanPhamService.getSanPhams().size(), "Danh sách còn lại phải có 2 sản phẩm");
    }

    @Test
    void testXoaSanPham_MaKhongTonTai() {
        assertFalse(sanPhamService.xoaSP("SP999"), "Xóa sản phẩm có mã không tồn tại phải trả về false");
        assertEquals(3, sanPhamService.getSanPhams().size(), "Danh sách vẫn giữ nguyên số lượng sản phẩm");
    }

    @Test
    void testXoaSanPham_DanhSachRong() {
        SanPhamService emptyService = new SanPhamService();
        assertFalse(emptyService.xoaSP("SP001"), "Xóa sản phẩm khi danh sách rỗng phải trả về false");
    }

    @Test
    void testXoaSanPham_XoaSanPhamDuyNhat() {
        SanPhamService singleService = new SanPhamService();
        singleService.themSP(new SanPham("SP100", "Máy ảnh", 3, 12000000, 2, "Công nghệ"));

        assertTrue(singleService.xoaSP("SP100"), "Xóa sản phẩm duy nhất trong danh sách phải trả về true");
        assertEquals(0, singleService.getSanPhams().size(), "Danh sách phải còn 0 sản phẩm");
    }

    @Test
    void testXoaSanPham_XoaSanPhamDauTien() {
        assertTrue(sanPhamService.xoaSP("SP001"), "Xóa sản phẩm đầu tiên phải thành công");
        assertEquals(2, sanPhamService.getSanPhams().size(), "Danh sách còn lại phải có 2 sản phẩm");
    }

    @Test
    void testXoaSanPham_XoaSanPhamCuoiCung() {
        assertTrue(sanPhamService.xoaSP("SP003"), "Xóa sản phẩm cuối cùng phải thành công");
        assertEquals(2, sanPhamService.getSanPhams().size(), "Danh sách còn lại phải có 2 sản phẩm");
    }
}
