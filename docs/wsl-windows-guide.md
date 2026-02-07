# WSL + Windows File Access Guide

If you're using WSL (Windows Subsystem for Linux), your terminal and Windows File Explorer are looking at **two different places** by default. This guide fixes that.

---

## The Problem

| Location | Who can see it |
|----------|----------------|
| `/home/your-username/` | WSL terminal only |
| `C:\Users\YourName\` | Windows only |

If you save files in `/home/` from terminal, Windows File Explorer can't find them. If you download files in Windows, terminal can't find them.

---

## The Fix

Work in `/mnt/c/` — this is your Windows C: drive accessible from WSL.

### One-Time Setup

```bash
# Create a java-work folder in your Windows user directory
mkdir -p /mnt/c/Users/YOUR_WINDOWS_USERNAME/java-work

# Go there
cd /mnt/c/Users/YOUR_WINDOWS_USERNAME/java-work
```

Replace `YOUR_WINDOWS_USERNAME` with your actual Windows username (check in File Explorer → `C:\Users\`).

### Every Time You Open Terminal

```bash
cd /mnt/c/Users/YOUR_WINDOWS_USERNAME/java-work
```

Or add this shortcut to your `.bashrc`:

```bash
echo 'alias jw="cd /mnt/c/Users/YOUR_WINDOWS_USERNAME/java-work"' >> ~/.bashrc
source ~/.bashrc
```

Now just type `jw` to jump to your java-work folder.

---

## Finding Your Files

### From Terminal → Windows

Your `/mnt/c/Users/YOUR_WINDOWS_USERNAME/java-work` folder is:

```
C:\Users\YOUR_WINDOWS_USERNAME\java-work
```

Open File Explorer and navigate there.

### From Windows → Terminal (if you saved in /home/)

In File Explorer address bar, type:

```
\\wsl$\Ubuntu\home\YOUR_LINUX_USERNAME\
```

This shows your WSL home directory in Windows.

---

## Moving Files Between Worlds

### From Windows Downloads to WSL working folder

```bash
cp /mnt/c/Users/YOUR_WINDOWS_USERNAME/Downloads/SomeFile.java .
```

### From WSL to Windows Desktop

```bash
cp SomeFile.java /mnt/c/Users/YOUR_WINDOWS_USERNAME/Desktop/
```

---

## Creating a .zip File (for Canvas submission)

From your java-work folder:

```bash
# Make sure you're in the right place
cd /mnt/c/Users/YOUR_WINDOWS_USERNAME/java-work

# Create zip
zip MyAssignment.zip MyAssignment.java

# Verify it exists
ls -la *.zip
```

The .zip file will now be visible in Windows File Explorer at:

```
C:\Users\YOUR_WINDOWS_USERNAME\java-work\MyAssignment.zip
```

Upload that to Canvas.

---

## Quick Reference

| Task | Command |
|------|---------|
| Go to Windows java-work | `cd /mnt/c/Users/NAME/java-work` |
| See current location | `pwd` |
| List files | `ls -la` |
| Copy from Downloads | `cp /mnt/c/Users/NAME/Downloads/file.java .` |
| Create zip | `zip Assignment.zip File.java` |

---

## Still Lost?

Run this to see exactly where you are:

```bash
pwd
```

- If it starts with `/home/` → you're in WSL-only land
- If it starts with `/mnt/c/` → you're in Windows-accessible land

**Always work in `/mnt/c/Users/YOUR_WINDOWS_USERNAME/java-work/` and you'll never lose files again.**
