# Terminal Scavenger Hunt

**COP2250 Java Programming | Extra Credit**  
**Kevin Pyatt, Ph.D. | Pyatt Labs**

No VS Code. No GUI. Terminal only.

## Required Commands

| # | Command | What it does |
|---|---------|--------------|
| 1 | `pwd` | Print working directory (where am I?) |
| 2 | `ls` | List files in current directory |
| 3 | `ls -la` | List files with details |
| 4 | `cd foldername` | Change directory — go INTO a folder |
| 5 | `cd ..` | Go UP one level |
| 6 | `cd ~` | Go to home directory |
| 7 | `mkdir foldername` | Make a new folder |
| 8 | `touch filename` | Create an empty file |
| 9 | `cat filename` | Display contents of a file |
| 10 | `echo "text"` | Print text to terminal |
| 11 | `echo "text" > file` | Write text to a file |
| 12 | `cp source dest` | Copy a file |
| 13 | `scp source user@host:dest` | Copy file to remote server |
| 14 | `rm filename` | Remove a file |
| 15 | `rm -r foldername` | Remove a folder and everything in it |
| 16 | `clear` | Clear the terminal screen |
| 17 | `nano filename` | Edit file in nano (simple editor) |
| 18 | `vim filename` | Edit file in vim (powerful editor) |
| 19 | `help` | List bash built-in commands |
| 20 | `man command` | Manual page for a command |
| 21 | `command --help` | Quick help for most commands |

### Getting Help

```bash
help              # List all bash built-ins
help cd           # Help for specific built-in
man ls            # Full manual for ls
ls --help         # Quick help for ls
```

When stuck, try `command --help` first. It's faster than `man`.

### Editor Quick Reference

**nano (beginner-friendly):**
- `Ctrl+O` — save
- `Ctrl+X` — exit

**vim (powerful):**
- `i` — enter insert mode
- `Esc` — exit insert mode
- `:wq` — save and quit
- `:q!` — quit without saving

## The Hunt

Complete each task IN ORDER.

### Level 1: Navigation

1. Open terminal
2. Run `pwd`
3. Run `cd ~`
4. Run `cd Desktop`
5. Run `cd ..`
6. Run `pwd`

### Level 2: Create Structure

7. `cd ~/Desktop`
8. `mkdir COP2250`
9. `cd COP2250`
10. `mkdir lab01`
11. `mkdir lab02`
12. `cd lab01`
13. `touch HelloWorld.java`

### Level 3: Write Content

14. `echo "public class HelloWorld { }" > HelloWorld.java`
15. `cat HelloWorld.java`
16. Open in nano: `nano HelloWorld.java`
17. Change content to:
    ```java
    public class HelloWorld {
        public static void main(String[] args) {
            System.out.println("Hello World");
        }
    }
    ```
18. Save: `Ctrl+O`, Enter, then `Ctrl+X` to exit
19. `cat HelloWorld.java`

### Level 4: Copy and Cleanup

20. `cp HelloWorld.java HelloCopy.java`
21. `ls`
22. `cd ..`
23. `rm -r lab02`
24. `ls`
25. `clear`

### Level 5: Direct Navigation

26. `cd ~`
27. `cd ~/Desktop/COP2250/lab01`
28. `ls -la`

### Bonus: Vim (+10 points)

29. `vim HelloWorld.java`
30. Press `i`, add comment: `// Created by YOUR NAME`
31. Press `Esc`, type `:wq`
32. `cat HelloWorld.java`

---

## Submission: TWO Screenshots Only

### Screenshot 1: Final Proof

From `~/Desktop/COP2250/lab01`, run:

```bash
echo "=== SCAVENGER HUNT COMPLETE ===" && echo "Name: YOUR NAME" && echo "Date: $(date)" && pwd && ls -la && echo "=== FILE CONTENTS ===" && cat HelloWorld.java
```

Screenshot this output.

### Screenshot 2: History Proof

Run:

```bash
history | tail -40
```

Screenshot this. Shows you actually ran the commands.

---

## Grading

| Criteria | Points |
|----------|--------|
| Screenshot 1: Correct folder structure, file contents | 50 |
| Screenshot 2: History shows commands executed | 40 |
| Name included in output | 10 |
| Vim bonus (comment visible in file) | +10 |
| **Total** | **100 (+10 bonus)** |

---

## Stuck?

- **Windows:** Use Git Bash, NOT PowerShell or CMD
- **Mac:** Use Terminal (Applications → Utilities)
- **Stuck in vim:** Press `Esc` then `:q!` to escape
- **"command not found":** Check spelling
- **Need help:** Try `command --help` or `man command`

## Why This Matters

Every file lives somewhere. If you can't navigate to it, you can't compile it.

`vim` is on every Linux server. When you SSH into production to fix a bug, there's no VS Code.

Be the engineer who can fix it.

---

© 2026 Kevin Pyatt, Ph.D. | Pyatt Labs
