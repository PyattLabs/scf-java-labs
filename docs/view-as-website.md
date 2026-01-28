# View Course Materials as Website

**COP2250 Java Programming**  
**Kevin Pyatt, Ph.D. | Pyatt Labs**

---

## Why?

Browse course materials in a clean, searchable website instead of clicking around GitHub.

---

## One-Time Setup

### Linux
```bash
sudo apt install nodejs npm
npm install -g docsify-cli
```

### Mac
```bash
brew install node
npm install -g docsify-cli
```

### Windows (WSL)
Open WSL terminal, then:
```bash
sudo apt install nodejs npm
npm install -g docsify-cli
```

---

## View the Site

```bash
cd ~/Desktop/scf-java-labs
git pull
docsify serve .
```

Open browser: **http://localhost:3000**

---

## What You Get

- Sidebar navigation
- Search functionality
- Syntax-highlighted code
- Clean readable docs
- Works offline

---

## Stop the Server

Press `Ctrl + C` in terminal.

---

## Troubleshooting

**"command not found: docsify"**
```bash
npm install -g docsify-cli
```

**"command not found: npm"**
Install Node.js first (see setup above).

**Port already in use**
```bash
docsify serve . -p 3001
```
Then open `http://localhost:3001`

---

© 2026 Kevin Pyatt, Ph.D. | Pyatt Labs
