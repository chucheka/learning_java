#	GIT & GITHUB

### Unstage a file accidentally added before a commit
`>$ git rm --cached <filename>`

### Uncommit a commit before push
	- Method 1
		1. >$ git revert HEAD --no-edit
		2. >$ git rm --cached <filename>
### Change A Commit Message
`>$ git commit --amend`

### Undo A Commit
	1. `>$ git reset --soft HEAD^`
	1. `>$ git rm --cached <filename>`