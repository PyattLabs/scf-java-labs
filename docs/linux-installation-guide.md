# Escape Windows: Linux Installation Guide

**COP2250 Java Programming**  
**Kevin Pyatt, Ph.D. | Pyatt Labs**

---

## Why Linux?

Windows has: PowerShell, CMD, Git Bash, WSL, Terminal... all different, all confusing.

Linux has: **One terminal. It just works.**

Every server, every cloud, every professional dev environment runs Linux. Learn it now.

---

## Three Options

| Option | Commitment | Risk | Best For |
|--------|------------|------|----------|
| **Live USB** | None | Zero | Try it first |
| **Dual Boot** | Medium | Low | Keep Windows as backup |
| **Full Install** | Full | Medium | All in, no looking back |

---

## Option 1: Live USB (Try Linux, No Installation)

**What it does:** Run Linux from a thumb drive. Your hard drive is untouched.

**You need:**
- USB drive (8GB+)
- 1 hour

**Steps:**

### 1. Download Linux Mint (beginner friendly)
```
https://linuxmint.com/download.php
```
Choose "Cinnamon" edition, 64-bit.

### 2. Download Balena Etcher (makes bootable USB)
```
https://etcher.balena.io/
```

### 3. Create bootable USB
1. Insert USB drive
2. Open Etcher
3. Select the Linux Mint .iso file
4. Select your USB drive
5. Click "Flash"
6. Wait 5-10 minutes

### 4. Boot from USB
1. Restart computer
2. Mash **F12** (or F2, F10, DEL — depends on your machine) during startup
3. Select USB drive from boot menu
4. Choose "Start Linux Mint"

### 5. You're in Linux
- Opens to desktop
- Terminal works: `Ctrl + Alt + T`
- Try it out, explore
- Nothing is saved when you shut down (unless you install)

---

## Option 2: Dual Boot (Keep Windows + Add Linux)

**What it does:** Install Linux alongside Windows. Choose which to boot.

**You need:**
- USB drive with Linux (from Option 1)
- 50GB+ free disk space
- 1-2 hours

**Steps:**

### 1. Shrink Windows partition
1. In Windows, press `Win + X` → Disk Management
2. Right-click your main drive (usually C:)
3. Select "Shrink Volume"
4. Shrink by at least 50000 MB (50GB)
5. Leave the new space as "Unallocated"

### 2. Disable Fast Startup (important!)
1. Control Panel → Power Options
2. "Choose what the power buttons do"
3. "Change settings that are currently unavailable"
4. Uncheck "Turn on fast startup"
5. Save

### 3. Boot from USB
1. Restart, boot from USB (same as Option 1)

### 4. Install Linux
1. Double-click "Install Linux Mint" on desktop
2. Follow wizard
3. When asked, choose **"Install alongside Windows"**
4. It will use the unallocated space
5. Complete installation, restart

### 5. Choose at boot
- Every startup shows menu: Windows or Linux
- Select Linux
- Windows still there if you need it

---

## Option 3: Full Install (Wipe Windows)

**What it does:** Erase Windows. Linux only.

**You need:**
- USB drive with Linux
- Backup anything important (photos, documents)
- Courage
- 1 hour

**Steps:**

### 1. Backup your shit
- Copy important files to external drive or cloud
- Once you wipe, it's gone

### 2. Boot from USB
Same as Option 1

### 3. Install Linux
1. Double-click "Install Linux Mint"
2. When asked, choose **"Erase disk and install Linux Mint"**
3. Confirm
4. Complete installation
5. Restart

### 4. Done
- Windows is gone
- Linux is home
- No more PowerShell confusion

---

## After Installation: Setup for COP2250

Open terminal (`Ctrl + Alt + T`) and run:

```bash
# Update system
sudo apt update && sudo apt upgrade -y

# Install essentials
sudo apt install -y git openjdk-17-jdk tree bat

# Verify Java
java -version
javac -version

# Clone course repo
cd ~/Desktop
git clone https://github.com/PyattLabs/scf-java-labs.git

# Test
cd scf-java-labs/labs/pet-challenge-part1
javac Pet.java PetShop.java
java PetShop
```

If that runs — you're set.

---

## Recommended Distros

| Distro | Best For |
|--------|----------|
| **Linux Mint** | Beginners, Windows refugees |
| **Pop!_OS** | Laptops, good hardware support |
| **Ubuntu** | Most tutorials written for it |
| **Fedora** | Cutting edge, developers |

Start with **Linux Mint** or **Pop!_OS**.

---

## Troubleshooting

**Can't boot from USB:**
- Try different F-key (F2, F10, F12, DEL)
- Disable Secure Boot in BIOS

**Screen looks weird:**
- Boot menu → choose "safe graphics" mode

**WiFi doesn't work:**
- Use ethernet for install
- Drivers usually install automatically

**Scared:**
- Start with Live USB — zero risk
- Dual boot — keep Windows as safety net

---

## The Truth

Windows is designed for consumers.  
Linux is designed for engineers.

You're becoming an engineer.

Make the switch.

---

© 2026 Kevin Pyatt, Ph.D. | Pyatt Labs
