package cihan.nezih.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by nezih on 30-Nov-17.
 */

public class UserActivity extends AppCompatActivity {
    TextView userNameTV;
    TextView logInTV;
    TextView bioTV;
    TextView repoNumTV;
    TextView updatedAtTV;
    TextView createdAtTV;
    TextView followersTV;
    TextView followingTV;

    Bundle extras;
    String newString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);

        userNameTV = (TextView) findViewById(R.id.username);
        logInTV = (TextView) findViewById(R.id.logIn);
        bioTV = (TextView) findViewById(R.id.bio);
        repoNumTV = (TextView) findViewById(R.id.public_repo);
        updatedAtTV = (TextView) findViewById(R.id.updated_at);
        createdAtTV = (TextView) findViewById(R.id.created_at);
        followersTV = (TextView) findViewById(R.id.followers);
        followingTV = (TextView) findViewById(R.id.following);

        extras = getIntent().getExtras();
        newString = extras.getString("STRING_I_NEED");

        System.out.println(newString);
        loadData();

    }
    public void loadData() {
        final GitHubUserEndPoints apiService =
                APIClient.getClient().create(GitHubUserEndPoints.class);

        Call<GitHubUser> call = apiService.getUser(newString);
        call.enqueue(new Callback<GitHubUser>() {

            @Override
            public void onResponse(Call<GitHubUser> call, Response<GitHubUser>
                    response) {

                userNameTV.setText("Name: " + response.body().getName());
                logInTV.setText("Username: " + response.body().getLogin());
                bioTV.setText("Description: " + response.body().getBio());
                repoNumTV.setText("Num. of Public Repos: " + response.body().getRepoNum());
                createdAtTV.setText("Acc. Created At: " + response.body().getCreatedAt());
                updatedAtTV.setText("Acc. Updated At : " + response.body().getUpdatedAt());
                followersTV.setText("Followed by: " + response.body().getFollowers());
                followingTV.setText("Following: " + response.body().getFollowing());
            }

            @Override
            public void onFailure(Call<GitHubUser> call, Throwable t) {

            }
        });
    }
}