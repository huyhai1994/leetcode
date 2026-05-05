Excellent 😄 ta làm thật bài bản.

Tôi sẽ đóng vai **tech lead giao task**.
Bạn sẽ code như đang nhận task backend ở công ty.

---

# DATE TIME JAVA CORE INTENSIVE — DAY 1

# Chủ đề: LocalDate / LocalDateTime / Instant Foundations

> Mục tiêu hôm nay:
>
> * phân biệt 3 class sống còn
> * cộng trừ ngày giờ
> * so sánh date
> * bắt đầu quen với việc viết JUnit cover edge case

---

# I. LÝ THUYẾT SIÊU NGẮN TRƯỚC KHI CODE

## 1. `LocalDate`

Chỉ có:

* year
* month
* day

Không có giờ.

Ví dụ:

```java id="r0w4o8"
2026-05-05
```

Dùng cho:

* ngày sinh
* ngày checkin
* ngày hết hạn coupon

---

## 2. `LocalDateTime`

Có:

* year month day
* hour minute second nano

Ví dụ:

```java id="nq9rjv"
2026-05-05T15:30:45
```

Dùng cho:

* thời gian tạo đơn
* thời gian tạo token
* thời gian payment

---

## 3. `Instant`

Đây là UTC timestamp tuyệt đối.

Máy chủ rất hay lưu kiểu này.

Ví dụ:

```java id="jvqj89"
2026-05-05T08:30:45Z
```

---

# II. TASK CÔNG TY GIAO CHO BẠN

Tạo package:

```java id="k2f4zj"
com.practice.datetime.day1
```

Tạo class:

```java id="8h1qql"
DateBasicsPractice
```

---

# III. YÊU CẦU IMPLEMENT

```java id="g7zzw9"
public class DateBasicsPractice {

    public LocalDate getToday() {
        return null;
    }

    public LocalDate getDateAfterDays(int days) {
        return null;
    }

    public LocalDate getDateBeforeDays(int days) {
        return null;
    }

    public LocalDateTime getCurrentDateTime() {
        return null;
    }

    public Instant getCurrentTimestamp() {
        return null;
    }

    public boolean isDateBefore(LocalDate d1, LocalDate d2) {
        return false;
    }

    public boolean isDateAfter(LocalDate d1, LocalDate d2) {
        return false;
    }

    public boolean isDateEqual(LocalDate d1, LocalDate d2) {
        return false;
    }

    public long daysBetween(LocalDate start, LocalDate end) {
        return 0;
    }
}
```

---

# IV. BUSINESS REQUIREMENT GIẢI THÍCH

---

## 1. `getToday()`

Trả về ngày hiện tại của hệ thống.

---

## 2. `getDateAfterDays(int days)`

Ví dụ hôm nay là 2026-05-05:

* input 7 -> 2026-05-12
* input 0 -> today
* input âm -> lùi ngày

---

## 3. `getDateBeforeDays(int days)`

* input 5 -> ngày trước 5 ngày

---

## 4. `getCurrentDateTime()`

Trả current local datetime.

---

## 5. `getCurrentTimestamp()`

Trả `Instant.now()`.

---

## 6. compare methods

* before
* after
* equal

---

## 7. `daysBetween(start,end)`

Tính số ngày chênh lệch.

Ví dụ:

05/05 -> 10/05 = 5 ngày.

Nếu start > end vẫn return số âm.

---

# V. BẮT BUỘC: VIẾT JUNIT 5 TEST

Tạo class:

```java id="v4l34k"
DateBasicsPracticeTest
```

---

# Skeleton test đầy đủ cho bạn

```java id="0g6ihx"
class DateBasicsPracticeTest {

    private final DateBasicsPractice service = new DateBasicsPractice();

    @Test
    void should_return_today() {
    }

    @Test
    void should_return_date_after_7_days() {
    }

    @Test
    void should_return_same_day_when_add_0_day() {
    }

    @Test
    void should_return_previous_day_when_add_negative_day() {
    }

    @Test
    void should_return_date_before_5_days() {
    }

    @Test
    void should_return_current_datetime_not_null() {
    }

    @Test
    void should_return_current_timestamp_not_null() {
    }

    @Test
    void should_return_true_when_date1_before_date2() {
    }

    @Test
    void should_return_false_when_date1_not_before_date2() {
    }

    @Test
    void should_return_true_when_date1_after_date2() {
    }

    @Test
    void should_return_true_when_dates_equal() {
    }

    @Test
    void should_calculate_days_between_correctly() {
    }

    @Test
    void should_return_negative_days_when_start_after_end() {
    }
}
```

---

# VI. EDGE CASE BẮT BUỘC PHẢI COVER

Backend dev mạnh là phải nghĩ được mấy case này:

| Method            | Edge case   |
| ----------------- | ----------- |
| getDateAfterDays  | input âm    |
| getDateBeforeDays | input 0     |
| compare date      | cùng ngày   |
| daysBetween       | start > end |
| now methods       | not null    |

---

# VII. HINT KỸ THUẬT (không phải đáp án full)

Bạn sẽ cần:

```java id="vwf6cz"
LocalDate.now()
LocalDateTime.now()
Instant.now()
plusDays()
minusDays()
isBefore()
isAfter()
isEqual()
ChronoUnit.DAYS.between()
```

---

# VIII. RULE HỌC NGHIÊM TÚC

## Bạn phải tự code trước.

Đừng xin đáp án ngay.

Quy trình:

1. bạn code class
2. bạn code test
3. chạy test
4. lỗi đâu gửi tôi stacktrace/code
5. tôi review như senior review PR

=> cách này mới lên tay rất nhanh.

---

# IX. BONUS CHALLENGE (nếu còn sức)

Viết thêm:

```java id="x73u7y"
boolean isWeekend(LocalDate date)
```

---

Code xong gửi tôi:

* source class
* test class
* hoặc ảnh lỗi

Tôi review tiếp cho bạn như review thật. 😄
