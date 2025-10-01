# DIRECT FUNDING SERVICE (DFSVC)
Implementation of Direct Funding Service (BE & FE monorepo)

# REST API's

**Micro-site --> DFS**
- getSession: GET .../dfs/v1/msapi/getSession
- getProfile: GET .../dfs/v1/msapi/getProfile
- setLimit: POST .../dfs/v1/msapi/setLimit
- getRecentTxs: GET .../dfs/v1/msapi/getRecentTxs

**IGT Pay --> DFS**
- getRemainingLimit: GET .../dfs/v1/pgapi/getRemainingLimit
- prepareTx: POST .../dfs/v1/pgapi/prepareTx
- completeTx: POST .../dfs/v1/pgapi/completeTx

**Note:**\
Initial implementation contains dummy version


# Microsite (FE)

**Deployment**\
Build and copy to folder:  dfsvc/src/main/resources/static

**Note:**\
Initial implementation contains dummy version


TBD