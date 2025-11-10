# 🧩 Anagram Checker

## 📖 Description

Two strings, **`a`** and **`b`**, are called *anagrams* if they contain all the same characters in the same frequencies — the order of the letters doesn’t matter.
This test is **case-insensitive**.

For example, the anagrams of `CAT` are:

```
CAT, ACT, tac, TCA, aTC, CtA
```

---

## 🧠 Function Description

Implement the function:

```java
boolean isAnagram(String a, String b)
```

### Parameters

* **`a`**: the first string
* **`b`**: the second string

### Returns

* **`boolean`** — return `true` if `a` and `b` are case-insensitive anagrams. Otherwise, return `false`.

---

## 🧩 Input Format

* The first line contains a string, **`a`**
* The second line contains a string, **`b`**

---

## ⚙️ Constraints

* Both **`a`** and **`b`** consist of **English alphabetic characters** only.
* The comparison is **not case-sensitive**.

---

## 🧪 Sample Tests

### ✅ Sample Input 0

```
anagram
margana
```

### 🧭 Sample Output 0

```
Anagrams
```

#### Explanation

| Character | Frequency (anagram) | Frequency (margana) |
| --------- | ------------------- | ------------------- |
| A or a    | 3                   | 3                   |
| G or g    | 1                   | 1                   |
| N or n    | 1                   | 1                   |
| M or m    | 1                   | 1                   |
| R or r    | 1                   | 1                   |

Both strings contain the same letters in the same frequencies → **Anagrams**

---

### ✅ Sample Input 1

```
anagramm
marganaa
```

### 🧭 Sample Output 1

```
Not Anagrams
```

#### Explanation

| Character | Frequency (anagramm) | Frequency (marganaa) |
| --------- | -------------------- | -------------------- |
| A or a    | 3                    | 4                    |
| M or m    | 2                    | 1                    |

The number of letters `a` and `m` differ → **Not Anagrams**

---

### ✅ Sample Input 2

```
Hello
hello
```

### 🧭 Sample Output 2

```
Anagrams
```

#### Explanation

Both strings have the same letters (case-insensitive) → **Anagrams**
