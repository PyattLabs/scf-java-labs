# Getting Course Materials

**COP2250 Java Programming**  
**Kevin Pyatt, Ph.D. | Pyatt Labs**

---

## First Time Setup (do once)

Open terminal and run:
```bash
cd ~/Desktop
git clone https://github.com/PyattLabs/scf-java-labs.git
cd scf-java-labs
ls
```

You now have all course materials.

---

## Every Class (get updates)
```bash
cd ~/Desktop/scf-java-labs
git pull
```

That's it. New files appear automatically.

---

## What's Inside
```
scf-java-labs/
├── docs/           ← Reference materials
├── labs/           ← Lab assignments
│   ├── pet-challenge-part1/
│   └── pet-challenge-part2/
└── slides/         ← Lecture slides (PDF)
```

---

## Troubleshooting

**"fatal: not a git repository"**  
You're in the wrong folder. Run: `cd ~/Desktop/scf-java-labs`

**"Already up to date"**  
Good. No new files since last pull.

**"error: Your local changes..."**  
You edited a file. Run: `git stash` then `git pull`

---

## Windows Users

Use **Git Bash**, not PowerShell or CMD.

---

© 2026 Kevin Pyatt, Ph.D. | Pyatt Labs
