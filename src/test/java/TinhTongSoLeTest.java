import com.example.KTNC_Buoi5.TinhTongSoLe;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class TinhTongSoLeTest {
    @Test
    void testTinhTongLe_DauVaoAm() {
        assertEquals(0, TinhTongSoLe.tinhTongLe(-5), "n < 1 phải trả về 0");
    }

    @Test
    void testTinhTongLe_DauVaoBang0() {
        assertEquals(0, TinhTongSoLe.tinhTongLe(0), "n = 0 phải trả về 0");
    }

    @Test
    void testTinhTongLe_NhoNhat() {
        assertEquals(1, TinhTongSoLe.tinhTongLe(1), "n = 1 phải trả về 1");
    }

    @Test
    void testTinhTongLe_NBang2() {
        assertEquals(1, TinhTongSoLe.tinhTongLe(2), "n = 2 phải trả về 1 (chỉ có 1 là số lẻ)");
    }

    @Test
    void testTinhTongLe_NBang10() {
        assertEquals(25, TinhTongSoLe.tinhTongLe(10), "n = 10 phải trả về 25 (1+3+5+7+9)");
    }

    @Test
    void testTinhTongLe_NSole() {
        assertEquals(25, TinhTongSoLe.tinhTongLe(9), "n = 9 phải trả về 25 (1+3+5+7+9)");
    }

    @Test
    void testTinhTongLe_NLeLon() {
        assertEquals(2500, TinhTongSoLe.tinhTongLe(99), "n = 99 phải trả về 2500");
    }

    @Test
    void testTinhTongLe_NChanLon() {
        assertEquals(2500, TinhTongSoLe.tinhTongLe(100), "n = 100 phải trả về 2500 (1+3+...+99)");
    }
}
